node{
  stage('SCM checkout') {
    echo"pulling changes from the branch"
    git 'https://github.com/madhukar-ojha/aws-login-rest'
  }
  stage('clean package'){
    def mvnHome = tool name: 'maven-3.6.3', type: 'maven'
    sh "${mvnHome}/bim/mvn package'
  }
}
