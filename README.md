# cf-env-sample
When migrating from an existing application to a more Cloud Native one, there may be situations where an existing application needs physical files on the file system of the server. With the emphemeral nature of the Cloud might make this a difficult proposition, not to mention in a PAAS the containers running the application may not be accessible.

A potential solution is to use Cloud Foundry's environmental variables.

This sample shows how to do this. The deploy.sh shows the correct order to push the application and then set the variables.

Contact luke.shannon@gmail.com with questions.



