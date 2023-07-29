def call(String project, String ImageTag, String dockerHubUser){
    sh """
        echo 'Deleting all local images'
        docker rmi ${dockerHubUser}/${project}:${ImageTag} 
        'docker image prune -af'
    """
}