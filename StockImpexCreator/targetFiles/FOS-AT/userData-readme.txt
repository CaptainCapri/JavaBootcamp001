"userData - allUsers.csv" contains all Users which we can create.
"userData.csv" only contains the users which are active on all Environments. If on User cannot login on any Env and cannot be recreated please remove him from userData.csv but leave him in "userData - allUsers.csv"


cat userData-allUsers.csv | while read user; do grep $(echo $user | cut -d, -f13) defekteUser.csv 1>/dev/null|| echo $user; done