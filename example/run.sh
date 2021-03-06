#!/bin/bash
FILENAME="pid.txt"
	while read -r line; do
		PID="$line"
	done < "$FILENAME"
	if ps -p "$PID" < /dev/null
		then
   		string=$(ps -p "$PID" -o comm=) 
   		if [[ $string == *"java"* ]]; 
   			then
  				echo "Instance running actually."
  			else
  				echo "Starting new instance:"
  				nohup java -jar helloWorld-0.0.1-SNAPSHOT.jar 300 >log.out 2>&1 & echo $! > pid.txt
		fi
		else
				echo "Starting new instance:"
  				nohup java -jar helloWorld-0.0.1-SNAPSHOT.jar 300 >log.out 2>&1 & echo $! > pid.txt
			
	fi
	
