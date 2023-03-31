package com.java.issueViewer;

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.client.utils.URIBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import com.java.issueViewer.objects.Issue;
import com.java.issueViewer.objects.IssueRequest;
import com.java.issueViewer.objects.IssueResponse;

/**
 * Rest controller for pulling issues from GitHub.
 * Not truly necessary given that we can hit the git api directly from react, but allows for future functionality.
 */
@RestController
@RequestMapping("/api")
public class IssueViewerController {

    @PostMapping(value = "/issues", produces = {"application/json"})
    public IssueResponse getIssues(@RequestBody IssueRequest request) {
        try {
            if (!validateUrl(request.getUrl())) {
                return new IssueResponse(new Issue[0], "Bad URL - please submit valid gitHub api endpoint", "ERROR");
            }
            URI uri = buildUri(request);
            ResponseEntity<Issue[]> result = (new RestTemplate()).getForEntity(uri.toString(), Issue[].class);
            return new IssueResponse(result.getBody(), "", "SUCCESS");
        } catch(Exception e) {
            // we should either log an error, or otherwise handle when git is down or a bad URL was passed
        }
        return new IssueResponse(new Issue[0], "Something went wrong; please try again", "ERROR");
    }

    // We will want to validate that the URL is a valid gitHub API link, ideally with a regex expression
    private Boolean validateUrl(String url) {
        return true;
    }

    // build the URL based on the form params
    private URI buildUri(IssueRequest request) throws URISyntaxException {
        URIBuilder builder = new URIBuilder(request.getUrl());
        if (request.getState() != null) builder.addParameter("state", request.getState());
        if (request.getPage() != null) builder.addParameter("page", request.getPage().toString());
        return builder.build();
    }
}
