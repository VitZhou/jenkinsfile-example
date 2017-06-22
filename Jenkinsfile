node{
    stage('Build') {
        steps {
            sh 'echo "start build"'
            sh 'maven clean package'
        }
    }
    stage('Sonar') {
        steps {
            sh 'mvn sonar:sonar'
        }
    }
    stage('Deploy') {
        steps {
            sh './build.sh'
        }
    }
}
