pipeline{
agent any
stages{
stage('Build'){
steps{
sh 'echo " This is a build stage"
}
}
stage('Test'){
steps{
sh 'echo "This is a test stage"'
}
}
stage('Deploy'){
steps{
sh 'echo "This is a Deploy stage"'
}
}
}
}
