
# This Script is used to clone existing VM on Hyper V

$NewVMPath="C:\Hyper-V\SIMM-TB\"
$VmClone = Read-Host -Prompt 'Input VM to clone'
$NewVm = Read-Host -Prompt 'Input new VM Name'

Stop-VM -Name $VmClone 

$path=Get-VMHardDiskDrive -VMName $VmClone | select -ExpandProperty Path

$NewVMPath=$NewVMPath+$NewVm
mkdir $NewVMPath
copy -V $path $NewVMPath

$vmPath=Get-VM -VMName LCP-ML | select * | select -ExpandProperty Path
$vmId=Get-VM -VMName LCP-ML | select * | select -ExpandProperty VMId
$vmId=$vmPath+"\Virtual Machines\"+$vmId +".vmcx"

Write-Host $NewVMPath
Write-Host $vmId

Import-VM -Path $vmId -Copy -GenerateNewId  -VirtualMachinePath $NewVMPath -VhdDestinationPath $NewVMPath

#-VirtualMachinePath $NewVMPath -VhdDestinationPath $NewVMPath

$vm = Get-VM | Where-Object {$_.Path.StartsWith($NewVMPath)}
Rename-VM -VM $vm -NewName $NewVm

Start-VM $VmClone