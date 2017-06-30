node {
    stage('Checkout') {
        checkout([$class: "GitSCM", branches: [[name: "master"]], userRemoteConfigs: [[url: "git@github.com:henryZ/jenkinsfile-example.git"]]])
    }
    stage('Build') {
        sh 'echo "start build"'
        sh 'mvn clean package'
        // process cucumber reports
        step([$class: 'CucumberReportPublisher', jsonReportDirectory: '/target/cucumber-report', fileIncludePattern: '*.json'])

        // send report to slack
        cucumberSendSlack channel: 'test-results-channel', json: 'target/test-results.json'
    }
    stage('Sonar') {
        sh 'mvn sonar:sonar'
    }
    stage('Deploy') {
        sh './build.sh'
    }
}
