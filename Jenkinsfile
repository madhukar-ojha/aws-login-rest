node{
  stage('SCM checkout') {
    git 'https://github.com/madhukar-ojha/aws-login-rest'
  }
  stage('clean package'){
    sh 'mvn clean package'
  }
}
