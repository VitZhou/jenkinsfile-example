node{
    stage('Checkout') {
        git 'https://github.com/henryZ/jenkinsfile-example.git'
    }
    stage('Build') {
        sh 'echo "start build"'
        sh 'mvn clean package'
    }
    stage('Sonar') {
        sh 'mvn sonar:sonar'
    }
    stage('Deploy') {
        sh './build.sh'
    }
}
