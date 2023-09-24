pipeline {
    agent any // Spécifie l'agent sur lequel le pipeline sera exécuté (n'importe quel agent disponible).

    stages {
        stage('Checkout') {
            steps {
                // Étape pour récupérer le code source du référentiel Git
                checkout scm
            }
        }

        stage('Build') {
            steps {
                // Étape pour construire votre projet Maven
                sh 'mvn clean package' // Exemple de commande de construction
            }
        }

        stage('Test') {
            steps {
                // Étape pour exécuter des tests Maven
                sh 'mvn test' // Exemple de commande de test
            }
        }
    }

    post {
        success {
            // Étape exécutée en cas de succès du pipeline
            echo 'Le pipeline a réussi !'
        }

        failure {
            // Étape exécutée en cas d'échec du pipeline
            echo 'Le pipeline a échoué.'
        }
    }
}
