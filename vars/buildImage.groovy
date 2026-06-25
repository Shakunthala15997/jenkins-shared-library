def call(ms,BUILD_NUMBER){
dir('services') {
                    dir(ms){
                        sh 'pwd'
                        sh 'docker build -t hiqode01.jfrog.io/shakunthala-docker/cicd-app/${ms}:V-1.0.0-${BUILD_NUMBER} .'
                    }
}}
