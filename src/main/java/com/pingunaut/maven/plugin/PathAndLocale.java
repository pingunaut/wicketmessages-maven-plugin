package com.pingunaut.maven.plugin;

import java.nio.file.Path;
import java.util.Locale;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class PathAndLocale implements Comparable<PathAndLocale> {
    private final Path path;
    private final Locale locale;

    public PathAndLocale(Path path, Locale locale) {
        this.path = path;
        this.locale = locale;
    }

    public Path getPath() {
        return path;
    }

    public Object getLocale() {
        return locale;
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    @Override
    public int compareTo(PathAndLocale o) {
        return CompareToBuilder.reflectionCompare(this, o);
    }
}