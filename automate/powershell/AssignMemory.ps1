# This Script is used to set memory for existing VM on Hyper V


$VmClone = Read-Host -Prompt 'Input VM to Set Memory'
$NewVm = Read-Host -Prompt 'VM Type [1- LCP , 2-SIMM , 3- TrainStep]'

#LCP
Set-VMMemory LCP-PL -DynamicMemoryEnabled $true -MinimumBytes 512MB -StartupBytes 256MB -MaximumBytes 1GB -Priority 50 -Buffer 25

#SIMM
Set-VMMemory LCP-PL -DynamicMemoryEnabled $true -MinimumBytes 512MB -StartupBytes 256MB -MaximumBytes 2GB -Priority 20 -Buffer 25

