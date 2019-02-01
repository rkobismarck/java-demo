# Jenkins
Sample PoC to handle the execution of a certain application, in an environment of automation inside the Jenkins server.

The purpose of this guide, is to provide you with a PoC of controlling an automation process inside Jenkins, when we need to reiterative fire certain task in a continued way.

### What will you need?
1. You'll need a valid jar file.
2. You'll need the executable sh file.
3. You'll need to setup the directory where all those items are going to be living.

### Assumptions.
At this point you will have an Unix instance where is going to be executed the code. You problem consist in the next premises:
1. You need to execute in an automated way certain jar file.
2. You need to schedule the execution of this routine, in a scheduled way.
3. If an instance of the program is running, you should not fire another one.
4. Just when there are no instances running, you're going to fire a new one.
5. You will trust in the PID, located in the PID.txt file.
6. After a execution, you'll save the PID in the PID.txt file so in that case this become the only source available to provide you with a control mechanism to avoid duplicities in the execution.

### Let's get start with this.
1. You'll need to set a directory where to hold all the elements:
2. The jar file to be executed.
3. The run.sh file, where resides the logic to control the execution.
4. You need to set exec permisions to the run.sh file. In this case you need to perform an:
		
```console
	MacBook-Pro-de-Roberto:AWS robertotrujillo$ chmod +x run.sh
```
### Architectural Diagram.

![alt text](https://github.com/rkobismarck/java-demo/blob/master/media-content/Overview.png "AWS Server Configuration")





