def call(String project, String ImageTag, String dockerHubUser){
    sh """
        
        docker image build -t ${dockerHubUser}/${project} .
        docker image tag ${dockerHubUser}/${project} ${dockerHubUser}/${project}:${ImageTag} 
        docker image tag ${dockerHubUser}/${project} ${dockerHubUser}/${project}:latest
       
    """
}