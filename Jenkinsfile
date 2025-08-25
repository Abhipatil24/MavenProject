pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Build World'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy World'
            }
        }
        stage('Test') {
            steps {
                echo 'Test World'
            }
        }
    }

    post {
        always {
            emailext(
                to: 'patil2001abhishek@gmail.com',
                subject: "Jenkins Pipeline: ${currentBuild.fullDisplayName} - ${currentBuild.currentResult}",
                body: """<p>Hello Abhishek,</p>
                         <p>Your Jenkins pipeline has finished running.</p>
                         <p><b>Status:</b> ${currentBuild.currentResult}</p>
                         <p><b>Job:</b> ${env.JOB_NAME}</p>
                         <p><b>Build Number:</b> ${env.BUILD_NUMBER}</p>
                         <p>Check the console output: 
                         <a href="${env.BUILD_URL}">${env.BUILD_URL}</a></p>""",
                mimeType: 'text/html'
            )
        }
    }
}

