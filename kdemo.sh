#!/usr/bin/env bash

dk="cd /c/CA/Test/demo-kotlin"

if [ "$1" == "" ]; then
	echo "Select option, followed by [ENTER]:"
	echo "1) Master"
	echo "2) 1-test-copy"
	echo "3) 2-extension-functions"


	read -p "Your Option: " option
  
else
	option=$1
	echo "Option $option selected"  
fi


if [ "$option" == "1" ]; then
	echo "Option $option selected: "
	$dk
	git checkout -f master	
	
elif [ "$option" == "2" ]; then
	echo "Option $option selected: "
	$dk
	git checkout -f 1-test-copy

elif [ "$option" == "3" ]; then
	echo "Option $option selected: "
	$dk
	git checkout -f 2-extension-functions
	
fi