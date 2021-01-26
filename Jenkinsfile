node{
  stage('SCM checkout') {
    echo"pulling changes from the branch"
    git 'https://github.com/madhukar-ojha/aws-login-rest'
  }
  stage('clean package'){
    sh 'mvn clean package'
  }
}
