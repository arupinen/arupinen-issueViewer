package com.issueViewer.backend.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Basic User info pulled from the GitHub API
 *
 * The following is an example blob from the kubernetes issues API endpoint:
 * "user": {
      "login": "payall4u",
      "id": 8684541,
      "node_id": "MDQ6VXNlcjg2ODQ1NDE=",
      "avatar_url": "https://avatars.githubusercontent.com/u/8684541?v=4",
      "gravatar_id": "",
      "url": "https://api.github.com/users/payall4u",
      "html_url": "https://github.com/payall4u",
      "followers_url": "https://api.github.com/users/payall4u/followers",
      "following_url": "https://api.github.com/users/payall4u/following{/other_user}",
      "gists_url": "https://api.github.com/users/payall4u/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/payall4u/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/payall4u/subscriptions",
      "organizations_url": "https://api.github.com/users/payall4u/orgs",
      "repos_url": "https://api.github.com/users/payall4u/repos",
      "events_url": "https://api.github.com/users/payall4u/events{/privacy}",
      "received_events_url": "https://api.github.com/users/payall4u/received_events",
      "type": "User",
      "site_admin": false
    }
 */

 @NoArgsConstructor
 @Data
public class User {
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("url")
    private String url;
}
