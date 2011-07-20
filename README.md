# Data files and configurations for Stanbol

This source repository holds artifacts that are used to load 

* OSGI configurations and/or
* data files

to a Stanbol Environment.

To avoid loading subversion repository with large binary files this artifacts
are typically not included but need to be build/precomputed or downloaded
form other sites.
The the documentations of the according module for details.

Modules of this repository tree are typically NOT part of the Stanbol reactor.
Because they are considered optional and typically it is necessary to download/
precompute some resources users might not want to do for each build.

Bundles used as default configuration by the Stanbol Launchers are also
available by included Maven repositories and will be downloaded during the
normal Stanbol build (if not yet available in the local cache). 

## OpenNLP

This sub-folder contains bundles that contain several OpenNLP models. Such
bundles will contribute such files to the Stanbol DataFileProvider.

## Sites

This sub-folder contains bundles that install ReferencedSites to the
Stanbol Entityhub. Typically such bundles only contain the configuration but
do not include the actual data. However for small data sets the index might
also be included in the bundle.
See the README.md files for details.

## Notes

Bundles created by the various modules depend on the following two components:

### DataFileProvider Service

The DataFileProvoder Service is typically used by components that need to load
big binary files to Apache Stanbol.
See {stanbol-root}/commons/stanboltools/datafileprovider for details

### Bundleprovider

The Bundleprovider is an extension to the Apache Sling installer framework
and supports to load multiple configuration files form a single bundle.

It is intended to be used in cases where a single Stanbol module needs to
package several configuration files (e.g. the configuration of several OSGI
Services).

See {stanbol-root}/commons/installer/bundleprovider for details.



