node{
    stage('Checkout') {
        checkout([$class: "GitSCM", branches: [[name: "master"]], userRemoteConfigs: [[url: "https://github.com/henryZ/jenkinsfile-example.git"]]])
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
