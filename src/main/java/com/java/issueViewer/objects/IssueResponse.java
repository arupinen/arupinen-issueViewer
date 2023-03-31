package com.java.issueViewer.objects;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Class for the issue getter response
 * Allows us to send error messaging/status to the frontend along with the issue list
 */
@AllArgsConstructor
@Data
public class IssueResponse {
    private Issue[] issues;
    private String message;
    private String status;
}
