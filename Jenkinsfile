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
            from: 'patil2001abhishek@gmail.com',
            subject: "Pipeline: ${currentBuild.fullDisplayName} - ${currentBuild.currentResult}",
            body: """<p>Hello Abhishek,</p>
                     <p>Your Jenkins pipeline has finished.</p>
                     <p><b>Status:</b> ${currentBuild.currentResult}</p>
                     <p><b>Job:</b> ${env.JOB_NAME}</p>
                     <p><b>Build URL:</b> <a href="${env.BUILD_URL}">${env.BUILD_URL}</a></p>""",
            mimeType: 'text/html'
        )
    }
}

}

