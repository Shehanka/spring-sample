package com.chamodshehanka.springsample.topic

/**
 * @author chamodshehanka on 3/6/2019
 * @project spring-sample
 */
class Topic {

    var topicID: String? = null
    var topicName: String? = null
    var topicDescription: String? = null

    constructor() {}

    constructor(topicID: String, topicName: String, topicDescription: String) {
        this.topicID = topicID
        this.topicName = topicName
        this.topicDescription = topicDescription
    }
}
