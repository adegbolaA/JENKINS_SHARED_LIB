def call(String project, String ImageTag, String dockerHubUser){

    withCredentials([usernamePassword(
                     credentialsId: 'docker',  
                     usernameVariable: 'USER',
                      passwordVariable: 'PASS'
                )]) {
                sh "docker login -u '$USER' -p '$PASS'"
            }
  
        sh "docker version"
        sh "docker image push  ${dockerHubUser}/${project}:${ImageTag}" 
        sh "docker image push ${dockerHubUser}/${project}:latest"
        sh "docker image list"
    
}



