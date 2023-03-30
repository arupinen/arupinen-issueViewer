package com.java.issueViewer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import com.java.issueViewer.objects.Issue;

/**
 * Rest controller for pulling issues from GitHub. Allows for the reorganization of data in future.
 */
@RestController
@RequestMapping("/api")
public class IssueViewerController {
    // Default GitHub issues URL.
    private final String URL = "https://api.github.com/repos/kubernetes/kubernetes/issues";

    @GetMapping("/issues")
    public Issue[] getIssues() {
        ResponseEntity<Issue[]> result = (new RestTemplate()).getForEntity(URL, Issue[].class);
        return result.getBody();
    }
}
