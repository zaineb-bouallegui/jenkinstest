pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Define your build steps here
                sh 'echo "Building..."'
            }
        }
    }

    post {
        success {
            steps {
                // Define steps for success
                sh 'echo "Pipeline succeeded!"'
            }
        }
        failure {
            steps {
                // Define steps for failure
                sh 'echo "Pipeline failed!"'
            }
        }
    }
}
