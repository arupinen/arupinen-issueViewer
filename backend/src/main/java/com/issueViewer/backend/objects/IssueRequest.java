package com.issueViewer.backend.objects;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Object to hold request parameter variables for pulling the issues
 */
@NoArgsConstructor
@Data
public class IssueRequest {
    private String url;
    private String state;
    private String assignee;
    private String creator;
    private String direction;
    private Integer page;
}
