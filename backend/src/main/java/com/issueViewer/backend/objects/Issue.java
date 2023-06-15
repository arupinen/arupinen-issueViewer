package com.issueViewer.backend.objects;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * GitHub issue pulled from the git rest API
 * Pulling out only those fields that seem directly relevant to an assumed user
 * 
 * Example blob (minus sub-classes)
 * {
    "url": "https://api.github.com/repos/kubernetes/kubernetes/issues/117016",
    "repository_url": "https://api.github.com/repos/kubernetes/kubernetes",
    "labels_url": "https://api.github.com/repos/kubernetes/kubernetes/issues/117016/labels{/name}",
    "comments_url": "https://api.github.com/repos/kubernetes/kubernetes/issues/117016/comments",
    "events_url": "https://api.github.com/repos/kubernetes/kubernetes/issues/117016/events",
    "html_url": "https://github.com/kubernetes/kubernetes/pull/117016",
    "id": 1647936169,
    "node_id": "PR_kwDOAToIks5NR1bv",
    "number": 117016,
    "title": "Set GOMAXPROCS explicitly",
    "user": {user},
    "labels": [
        ...,
        {label}
    ],
    "state": "open",
    "locked": false,
    "assignee": {user},
    "assignees": [
      ...,
      {user}
    ],
    "milestone": null,
    "comments": 6,
    "created_at": "2023-03-30T16:23:18Z",
    "updated_at": "2023-03-30T16:28:05Z",
    "closed_at": null,
    "author_association": "MEMBER",
    "active_lock_reason": null,
    "draft": false,
    "pull_request": {object},
    "body": "This problem has shown up a few times:\r\n- https://kubernetes.slack.com/archives/C09QZ4DQB/p1680100017756909?thread_ts=1680070904.213609&cid=C09QZ4DQB\r\n- https://kubernetes.slack.com/archives/C0EG7JC6T/p1680114776876349?thread_ts=1680097452.862339&cid=C0EG7JC6T\r\n\r\nSo let's detect and set the GOMAXPROCS environment variable unless it is already set in the environment\r\n\r\n<!--  Thanks for sending a pull request!  Here are some tips for you:\r\n\r\n1. If this is your first time, please read our contributor guidelines: https://git.k8s.io/community/contributors/guide/first-contribution.md#your-first-contribution and developer guide https://git.k8s.io/community/contributors/devel/development.md#development-guide\r\n2. Please label this pull request according to what type of issue you are addressing, especially if this is a release targeted pull request. For reference on required PR/issue labels, read here:\r\nhttps://git.k8s.io/community/contributors/devel/sig-release/release.md#issuepr-kind-label\r\n3. Ensure you have added or ran the appropriate tests for your PR: https://git.k8s.io/community/contributors/devel/sig-testing/testing.md\r\n4. If you want *faster* PR reviews, read how: https://git.k8s.io/community/contributors/guide/pull-requests.md#best-practices-for-faster-reviews\r\n5. If the PR is unfinished, see how to mark it: https://git.k8s.io/community/contributors/guide/pull-requests.md#marking-unfinished-pull-requests\r\n-->\r\n\r\n#### What type of PR is this?\r\n/kind bug\r\n\r\n<!--\r\nAdd one of the following kinds:\r\n/kind cleanup\r\n/kind documentation\r\n/kind feature\r\n\r\nOptionally add one or more of the following kinds if applicable:\r\n/kind api-change\r\n/kind deprecation\r\n/kind failing-test\r\n/kind flake\r\n/kind regression\r\n-->\r\n\r\n#### What this PR does / why we need it:\r\n\r\n#### Which issue(s) this PR fixes:\r\n<!--\r\n*Automatically closes linked issue when PR is merged.\r\nUsage: `Fixes #<issue number>`, or `Fixes (paste link of issue)`.\r\n_If PR is about `failing-tests or flakes`, please post the related issues/tests in a comment and do not use `Fixes`_*\r\n-->\r\nFixes #116997\r\n\r\n#### Special notes for your reviewer:\r\n\r\n#### Does this PR introduce a user-facing change?\r\n<!--\r\nIf no, just write \"NONE\" in the release-note block below.\r\nIf yes, a release note is required:\r\nEnter your extended release note in the block below. If the PR requires additional action from users switching to the new release, include the string \"action required\".\r\n\r\nFor more information on release notes see: https://git.k8s.io/community/contributors/guide/release-notes.md\r\n-->\r\n```release-note\r\nNONE\r\n```\r\n\r\n#### Additional documentation e.g., KEPs (Kubernetes Enhancement Proposals), usage docs, etc.:\r\n\r\n<!--\r\nThis section can be blank if this pull request does not require a release note.\r\n\r\nWhen adding links which point to resources within git repositories, like\r\nKEPs or supporting documentation, please reference a specific commit and avoid\r\nlinking directly to the master branch. This ensures that links reference a\r\nspecific point in time, rather than a document that may change over time.\r\n\r\nSee here for guidance on getting permanent links to files: https://help.github.com/en/articles/getting-permanent-links-to-files\r\n\r\nPlease use the following format for linking documentation:\r\n- [KEP]: <link>\r\n- [Usage]: <link>\r\n- [Other doc]: <link>\r\n-->\r\n```docs\r\n\r\n```\r\n",
    "reactions": {[object]},
    "timeline_url": "https://api.github.com/repos/kubernetes/kubernetes/issues/117016/timeline",
    "performed_via_github_app": null,
    "state_reason": null
  }
 */
@NoArgsConstructor
@Data
public class Issue {
    @JsonProperty("url")
    private String url;

    @JsonProperty("html_url")
    private String html_url;

    @JsonProperty("repository_url")
    private String repository_url;

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("number")
    private Integer number;

    @JsonProperty("title")
    private String title;

    @JsonProperty("state")
    private String state;

    @JsonProperty("locked")
    private Boolean locked;

    @JsonProperty("assignee")
    private User assignee;

    @JsonProperty("user")
    private User user;

    @JsonProperty("labels")
    private List<Label> labels;
}
