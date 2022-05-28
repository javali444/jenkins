multibranchPipelineJob('cart') {
    branchSources {
        git {
            id('1234') // IMPORTANT: use a constant and unique identifier
            remote('https://github.com/javali444/cart.git')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }

}