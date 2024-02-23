def call(String aws_account_id, String region, String ecr_repoName){
    // sh """
    //     aws ecr get-login-password --region ${region} | docker login --username AWS --password-stdin ${aws_account_id}.dkr.ecr.${region}.amazonaws.com
    //     docker push ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repoName}:latest
        
       
    // """

    // Check if AWS CLI and Docker are installed
    sh "which aws && which docker"
    
    // Login to ECR and push the Docker image
    sh """
        set +x
        aws ecr get-login-password --region ${region} | docker login --username AWS --password-stdin ${aws_account_id}.dkr.ecr.${region}.amazonaws.com || { echo 'ECR login failed'; exit 1; }
        docker push ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repoName}:latest || { echo 'Docker push failed'; exit 1; }
    """
}
