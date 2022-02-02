package com.luv2code.springsecurity.demo.config;
import jdk.nashorn.internal.objects.annotations.Getter;

@Getter
class Response {

    @JsonSetter("p_review")
    private String rReview;

  @JsonSetter("t_review")
  private String translatedContent;
  }

  public String getPostContent() {
    return getAutoTranslated() ? translatedContent : postContent;
  }
}