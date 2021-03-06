
Install dependencies

Before you can get started, you should install the Java Developer Kit, version 8. Make sure that the JAVA_HOME environment variable gets set to the install location of the JDK. You will also need to install Apache Maven, version 3.0 or above.

You should also install Node.JS which includes npm. This is how you will obtain the Azure Functions Core Tools. If you prefer not to install Node, see the other installation options in our Core Tools reference.

Run the following command to install the Core Tools package:

npm install -g azure-functions-core-tools

The Core Tools make use of .NET Core 2.1, so you should install that, too.

Lastly, install the Azure CLI 2.0. Once this is installed, make sure you are logged in by running the login command and following the onscreen instructions:

az login


Create an Azure Functions project

In the terminal window or from a command prompt, navigate to an empty folder for your project, and run the following command:

mvn archetype:generate -DarchetypeGroupId=com.microsoft.azure -DarchetypeArtifactId=azure-functions-archetype -DappName=payments-functions-java -DappRegion={region} -DresourceGroup={resourceGroup} -DgroupId=com.{functionAppName}.group -DartifactId={functionAppName}-functions -Dpackage=com.{functionAppName} -DinteractiveMode=false


Create a function

Creating the project creates an HTTP function by default, so you don't have to do anything for this step right now. Later, if you want to add a new function, run the following command:

mvn azure-functions:add

Maven will prompt you to select and customize a template for the new function.


Run your function project locally

Enter the following command to run your function app:

mvn clean package 
mvn azure-functions:run

The runtime will output a URL for any HTTP functions, which can be copied and run in your browser's address bar.

To stop debugging, use Ctrl-C in the terminal.


Deploy your code to Azure

Use the Finish and go to Deployment Center button below to navigate to Deployment Center and finish setting up your app. This will take you through a new wizard to configure a variety of deployment options. After completing this flow, trigger a deployment using whichever mechanism you configured.
