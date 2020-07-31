package examples.poemdistance.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class HelloWorldController{

    @GetMapping("/{name}")
    fun hello(@PathVariable("name") name:String): Map<String, Any> {
        return mapOf<String, Any>("retCode" to 200, "retMsg" to "success", "data" to "Hello $name!")

    }

}