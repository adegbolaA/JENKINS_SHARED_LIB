def call(String project, String ImageTag, String dockerHubUser){
    sh """
       
        docker rmi ${dockerHubUser}/${project}:${ImageTag} 
        docker image prune -a
    """
}