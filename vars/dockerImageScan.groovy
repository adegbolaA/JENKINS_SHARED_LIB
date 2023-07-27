def call(String project, String ImageTag, String dockerHubUser){
    sh """
        trivy image ${dockerHubUser}/${project} ${dockerHubUser}/${project}:latest > scan.txt
        cat scan.txt
    """
}