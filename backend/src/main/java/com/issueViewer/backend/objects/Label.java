package com.issueViewer.backend.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Label for a GitHub Issue
 *
 * The following is an example blob from the kubernetes issues API endpoint:
 * {
        "id": 105146071,
        "node_id": "MDU6TGFiZWwxMDUxNDYwNzE=",
        "url": "https://api.github.com/repos/kubernetes/kubernetes/labels/kind/bug",
        "name": "kind/bug",
        "color": "e11d21",
        "default": false,
        "description": "Categorizes issue or PR as related to a bug."
      }
 */
@NoArgsConstructor
@Data
public class Label {
    @JsonProperty("id")
    private Long id;

    @JsonProperty("url")
    private String url;

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;
}
