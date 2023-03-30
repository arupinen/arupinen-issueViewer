package com.java.issueViewer;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class IssueViewerController {
    @GetMapping("/issues")
    public String getIssues() {
        return "Hello Works";
    }
}
