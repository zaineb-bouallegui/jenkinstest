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
            // Define steps for success (e.g., notifications or additional actions)
            echo 'Pipeline succeeded!'
        }
        failure {
            // Define steps for failure (e.g., notifications or cleanup)
            echo 'Pipeline failed!'
        }
    }
}
