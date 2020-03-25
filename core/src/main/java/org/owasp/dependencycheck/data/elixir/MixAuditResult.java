/*
 * This file is part of dependency-check-core.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Copyright (c) 2020 OWASP Foundation. All Rights Reserved.
 */
package org.owasp.dependencycheck.data.elixir;

import java.util.List;

/**
 * Represents a single vulnerability result from `mix_audit --format json`.
 *
 * @author defsprite
 */
public class MixAuditResult {

    private final String id;
    private final String cve;
    private final String title;
    private final String description;
    private final String disclosureDate;
    private final String url;
    private final List<String> patchedVersions;

    private final String dependencyLockfile;
    private final String dependencyPackage;
    private final String dependencyVersion;

    public MixAuditResult(String id, String cve, String title, String description, String disclosureDate,
            String url, List<String> patchedVersions, String dependencyLockfile, String dependencyPackage,
            String dependencyVersion) {
        this.id = id;
        this.cve = cve;
        this.title = title;
        this.description = description;
        this.disclosureDate = disclosureDate;
        this.url = url;
        this.patchedVersions = patchedVersions;
        this.dependencyLockfile = dependencyLockfile;
        this.dependencyPackage = dependencyPackage;
        this.dependencyVersion = dependencyVersion;
    }

    public String getId() {
        return id;
    }

    public String getCve() {
        return cve;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDisclosureDate() {
        return disclosureDate;
    }

    public String getUrl() {
        return url;
    }

    public List<String> getPatchedVersions() {
        return patchedVersions;
    }

    public String getDependencyLockfile() {
        return dependencyLockfile;
    }

    public String getDependencyPackage() {
        return dependencyPackage;
    }

    public String getDependencyVersion() {
        return dependencyVersion;
    }
}
