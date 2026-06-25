def call(ms,BUILD_NUMBER){
steps{
                script{
                    withCredentials([usernamePassword(credentialsId: 'jfrog-prod', passwordVariable: 'pass', usernameVariable: 'user')]) {
                        sh "docker login -u ${user} -p ${pass} hiqode01.jfrog.io"
                        sh "docker push hiqode01.jfrog.io/shakunthala-docker/cicd-app/${ms}:V-1.0.0-${BUILD_NUMBER}" 
                        sh "docker rmi hiqode01.jfrog.io/shakunthala-docker/cicd-app/${ms}:V-1.0.0-${BUILD_NUMBER}"
                    }
                }
            }
}
