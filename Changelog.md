# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project follows to [Ragnarök Versioning Convention](https://gist.github.com/JustDesoroxxx/5d4a45785ce19a6653ba99f72325c703).

## [Unreleased] Modern Warfare Cubed Version 0.1 Changelog

### Added

- Added url in mod info page

### Changed

- Changed name
- Changed description in mod info page

### Fixed

- Fixed crash when `Allow Emissive Item Rendering` is enabled

### Optimization

- Replaced `Minecraft.getMinecraft()` with a static final constant

### Internal

- Updated Forge version
- General clean up
- Centralized mod version in `mcmod.info`
- Improved build times by a lot
- Fixed `runClient`
- Cleaned up some imports

#### Known Issues

- 3D models not rendering when `Allow Emissive Item Rendering` is enabled

##### Credits
