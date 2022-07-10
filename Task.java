File destFile = new File(targetDir.getAbsolutePath() + File.separator
    + file.getName());
try {
  showMessage("Copying " + file.getName());
  in = new BufferedInputStream(new FileInputStream(file));
  out = new BufferedOutputStream(new FileOutputStream(destFile));
  int n;
  while ((n = in.read()) != -1) {
    out.write(n);
  }
  showMessage("Copied " + file.getName());
} catch (Exception e) {
  showMessage("Cannot copy file " + file.getAbsolutePath());
} finally {
  if (in != null)
    try {
      in.close();
    } catch (Exception e) {
    }
  if (out != null)
    try {
      out.close();
    } catch (Exception e) {
    }
}
