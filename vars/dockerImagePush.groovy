def call(String project, String ImageTag, String dockerHubUser){

    withCredentials([usernamePassword(
                     credentialsId: 'docker', 
                     passwordVariable: 'PASS', 
                     usernameVariable: 'USER'
                )]) {
                sh "docker login -u '$USER' -p '$PASS'"
            }
  
       
        sh "docker image push  ${dockerHubUser}/${project}:${ImageTag}" 
        sh "docker image push ${dockerHubUser}/${project}:latest"
    
}



