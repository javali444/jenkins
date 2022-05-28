multibranchPipelineJob('CI-pipeline/cart') {
    branchSources {
        github {
            id('23232323') // IMPORTANT: use a constant and unique identifier
            scanCredentialsId('GitHub')
            repository('https://github.com/javali444/cart.git')
        }
    }
}