def call(branch,ur){
  git branch:"${branch}" url:"${url}"
  sh 'mvn clean install'
                sh "docker build -t hiqode01.jfrog.io/shakunthala-docker/shimage:v1-${BUILD_NUMBER} -f Dockerfile ."
                sh "docker images"
}
