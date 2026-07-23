package com.anupriyam.simpleexampleapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {

/**
 * Adds two integer values received through HTTP query parameters.
 *
 * Example:
 * GET /add?a=10&b=20
 *
 * Response:
 * 30
 *
 * @param a first operand
 * @param b second operand
 * @return sum of the provided operands
 */

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return a+b;
    }
}
