def call(String project, String ImageTag, String dockerHubUser){
    sh """
       
        docker rmi ${dockerHubUser}/${project}:${ImageTag} 
        docker pull ${dockerHubUser}/${project}:latest
        docker rmi ${dockerHubUser}/${project} ${dockerHubUser}/${project}:latest
    """
}