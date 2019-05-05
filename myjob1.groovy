job('My Job 1') {
    scm {
        git('https://github.com/Mathiaslachot/docker_jenkins.git') {  node -> 
            node / gitConfigName('mlachot  ')
            node / gitConfigEmail('mathias.lachot@orange.fr')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('NodeJS10')
    }
    steps {
        shell("npm install")
        shell("npm test")
    }
}
