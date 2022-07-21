#!/bin/sh
echo "-----Largest and Smallest of 3 Numbers-----"
echo "Enter the first number:"
read a
echo "Enter the second number:"
read b
echo "Enter the third number:"
read c
if [ $((a)) -gt $((b)) ]
then
	if [ $((a)) -gt $((c)) ]
	then
		echo "$a is larger."
	else 
		echo "$c is larger."
	fi
else
	if [ $((b)) -gt $((c)) ]
	then 
		echo "$b is larger."
	else 
		echo "$c is larger."
	fi
fi
if [ $((a)) -lt $((b)) ]
then
	if [ $((a)) -lt $((c)) ]
	then
		echo "$a is smaller."
	else 
		echo "$c is smaller."
	fi
else
	if [ $((b)) -lt $((c)) ]
	then 
		echo "$b is smaller."
	else 
		echo "$c is smaller."
	fi
fi
