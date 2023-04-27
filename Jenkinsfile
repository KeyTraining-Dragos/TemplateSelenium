pipeline{
agent any
stages {
stage ('Dragos zice :Compile Stage') {
tools {
        maven "apache-maven-3.0.5"
      }
      steps {
        echo "This is the complie phase"
        sh 'mvn clean compile'
      }
    }
stage ('Dragos zice : Testing stage'){
tools {
        maven "apache-maven-3.0.5"
      }
     
      steps {
        echo "This is the unit test phase"
        sh 'mvn test'
      }
}
stage ('Dragos zice : Package stage'){
tools {
        maven "apache-maven-3.0.5"
      }
      steps {
        echo "This is the Maven package phase"
        sh 'mvn package'
      }
      }
stage ('Dragos zice : Deploy stage'){
tools {
        maven "apache-maven-3.0.5"
      }
      steps {
        echo "This is the deploy stage"
        sh 'mvn deploy'
      }
      }
}


}
